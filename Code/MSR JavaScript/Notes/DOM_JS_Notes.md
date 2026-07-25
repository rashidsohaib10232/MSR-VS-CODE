# DOM & JavaScript — Complete Notes
### (Coder Army JS Series — DOM Manipulation, Events, Forms, Storage)

---

## 1. What is the DOM?

- **DOM = Document Object Model** — the browser's live, tree-shaped representation of your HTML.
- Every tag (`<div>`, `<p>`, `<h1>`...) becomes a **node** in this tree.
- JS doesn't touch your HTML file directly — it touches the DOM (an in-memory object), and the browser re-renders the page.
- `document` is the root object you use to access this tree.

```
document
 └── html
      ├── head
      └── body
           ├── h1
           ├── div
           │    └── p
           └── button
```

**Why it matters:** Without DOM manipulation, JS can only do math/logic — it can't change what the user *sees*. This is the bridge between logic and UI.

---

## 2. Selecting Elements

| Method | Returns | Notes |
|---|---|---|
| `document.getElementById('id')` | Single element | Fastest, most specific |
| `document.getElementsByClassName('cls')` | HTMLCollection (live) | Not an array — needs conversion for `.map()` etc. |
| `document.getElementsByTagName('tag')` | HTMLCollection (live) | e.g. all `<li>` |
| `document.querySelector('css-selector')` | First match only | Use ANY CSS selector: `.class`, `#id`, `div > p` |
| `document.querySelectorAll('css-selector')` | NodeList (static) | Supports `.forEach()` directly |

```js
const btn = document.querySelector('#submitBtn');
const items = document.querySelectorAll('.list-item'); // NodeList
items.forEach(item => console.log(item.textContent));

// Converting HTMLCollection to array (for map/filter/reduce):
const arr = Array.from(document.getElementsByClassName('cls'));
```

**Interview tip:** `querySelectorAll` = static snapshot (won't auto-update if DOM changes later). `getElementsByClassName` = live collection (auto-updates).

---

## 3. Content Modification

| Property | What it does | Renders HTML tags? | Respects CSS (display:none)? |
|---|---|---|---|
| `innerText` | Visible text only | ❌ | ✅ (ignores hidden text) |
| `textContent` | ALL text (incl. hidden) | ❌ | ❌ (ignores CSS entirely) |
| `innerHTML` | Text + HTML markup | ✅ | — |

```js
el.innerText = "Hello";          // safe, but slow (triggers reflow)
el.textContent = "Hello";        // fastest, safest, use by default
el.innerHTML = "<b>Hello</b>";   // use only when you need to inject HTML
```

⚠️ **Security note:** Never put raw user input into `innerHTML` — this opens an **XSS (Cross-Site Scripting)** vulnerability. Use `textContent` for user-generated text.

---

## 4. Attribute Handling

```js
const img = document.querySelector('img');

img.getAttribute('src');              // read
img.setAttribute('src', 'new.jpg');   // write
img.removeAttribute('alt');           // remove
img.hasAttribute('data-id');          // boolean check

// Direct property access also works for standard attributes:
img.src = 'new.jpg';
img.id = 'main-img';

// classList — the preferred way to handle classes:
el.classList.add('active');
el.classList.remove('hidden');
el.classList.toggle('dark-mode');
el.classList.contains('active'); // boolean
```

---

## 5. Creating, Adding, Removing Elements (Dynamic DOM)

```js
// Create
const li = document.createElement('li');
li.textContent = 'New Item';

// Add to DOM
parentEl.appendChild(li);            // adds at end
parentEl.prepend(li);                // adds at start
parentEl.insertBefore(li, referenceNode);
referenceNode.after(li);
referenceNode.before(li);

// Remove
li.remove();                         // modern, simple
parentEl.removeChild(li);            // older way

// Replace
parentEl.replaceChild(newEl, oldEl);
```

**Performance tip:** If adding many elements in a loop, build them inside a `DocumentFragment` first, then append once — avoids multiple reflows.

---

## 6. Event Handling

```js
btn.addEventListener('click', function(e) {
  console.log('Button clicked!', e.target);
});

// Arrow function version
btn.addEventListener('click', (e) => console.log(e));

// Remove a listener (function must be named/referenced, not anonymous)
btn.removeEventListener('click', handlerFn);
```

**Common events:** `click`, `dblclick`, `mouseover`, `mouseout`, `keydown`, `keyup`, `submit`, `change`, `input`, `focus`, `blur`, `load`, `DOMContentLoaded`.

### Event Object important properties
- `e.target` → element that triggered the event
- `e.preventDefault()` → stop default browser action (e.g. form submit reload)
- `e.stopPropagation()` → stop event from bubbling up to parent elements

### Event Bubbling & Delegation (important — often skipped by beginners)
Events **bubble up** from child → parent → document. This lets you use **event delegation**: attach ONE listener to a parent instead of many to each child (great for dynamic lists).

```js
document.querySelector('ul').addEventListener('click', (e) => {
  if (e.target.tagName === 'LI') {
    console.log('You clicked:', e.target.textContent);
  }
});
```

---

## 7. Forms & Validation

```js
const form = document.querySelector('#myForm');

form.addEventListener('submit', (e) => {
  e.preventDefault(); // stop page reload
  const name = document.querySelector('#name').value;

  if (name.trim() === '') {
    alert('Name required');
    return;
  }
  console.log('Submitted:', name);
});
```

**Real-time validation** — use the `input` event, not `change` (input fires on every keystroke, change fires on blur/lose-focus):
```js
emailInput.addEventListener('input', (e) => {
  const valid = /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(e.target.value);
  emailInput.style.borderColor = valid ? 'green' : 'red';
});
```

**HTML5 built-in validation attributes:** `required`, `pattern`, `minlength`, `maxlength`, `min`, `max`, `type="email"`.

---

## 8. Timers

```js
// setTimeout — run ONCE after delay (ms)
const timeoutId = setTimeout(() => console.log('Runs once after 2s'), 2000);
clearTimeout(timeoutId); // cancel before it fires

// setInterval — run REPEATEDLY every N ms
const intervalId = setInterval(() => console.log('Every 1s'), 1000);
clearInterval(intervalId); // must clear or it runs forever (memory leak)
```

**Common use case:** debounce (wait till user stops typing before running search) uses `setTimeout` + `clearTimeout` together.

---

## 9. Storage: localStorage, sessionStorage, Cookies

| Feature | localStorage | sessionStorage | Cookies |
|---|---|---|---|
| Persists after tab close | ✅ Yes | ❌ No | ✅ (until expiry) |
| Sent to server on every request | ❌ No | ❌ No | ✅ Yes |
| Storage limit | ~5–10MB | ~5–10MB | ~4KB |
| Access | JS only | JS only | JS + Server |

```js
// localStorage / sessionStorage — same API
localStorage.setItem('username', 'Sohaib');
localStorage.getItem('username');     // 'Sohaib'
localStorage.removeItem('username');
localStorage.clear();                 // wipes everything

// Storing objects/arrays — MUST stringify (storage only holds strings)
const user = { name: 'Sohaib', rank: 18 };
localStorage.setItem('user', JSON.stringify(user));

const retrieved = JSON.parse(localStorage.getItem('user'));
console.log(retrieved.name); // 'Sohaib'
```

```js
// Cookies (more manual, older API)
document.cookie = "theme=dark; max-age=3600; path=/";
console.log(document.cookie); // "theme=dark"
```

**You already know this pattern** — your StudyTrack and TechZone Store use Supabase auth, which relies on similar token-storage concepts under the hood (JWT usually in localStorage or cookies).

---

## 10. Extra Topics Worth Knowing (not in the video but commonly asked alongside)

- **`DOMContentLoaded` vs `window.onload`:** DOMContentLoaded fires when HTML is parsed (images may still be loading); `load` fires when EVERYTHING (images, CSS) is done. Always wrap your DOM-manipulation JS in:
  ```js
  document.addEventListener('DOMContentLoaded', () => { /* your code */ });
  ```
- **`this` inside event listeners:** Regular `function(){}` → `this` = the element clicked. Arrow function → `this` = outer scope (NOT the element). This trips up beginners a lot.
- **Debouncing/Throttling:** Used to limit how often a function runs (e.g. on `scroll` or `input` events) — combines `setTimeout`.
- **NodeList vs Array vs HTMLCollection:** Know the difference cold — it's a common interview trap.

---

## How to Actually Learn This (not just watch)

1. Don't just watch at 1x/1.5x and nod — **pause after every sub-topic and type the code yourself** in a blank HTML file.
2. After finishing, build ONE small project same day: a **To-Do List app** (create, delete, mark done, save to localStorage) — it touches almost every topic above in one build.
3. Don't binge all 6 hours today. Split: Selecting + Content + Attributes today, Events + Forms tomorrow, Storage + project after.

---

**Daily report time — before you go further:**
- DSA/LC today — done or not? Which problems?
- Is this JS session replacing DSA time or happening *after* DSA is done?

Don't answer "will do both" — tell me what's actually done right now.
