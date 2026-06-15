// ===== SCROLL REVEAL =====
const revealElements = document.querySelectorAll(
  '.project-card, .stat, .stack-group, .contact-card, .section-header'
);

revealElements.forEach(el => el.classList.add('reveal'));

const observer = new IntersectionObserver((entries) => {
  entries.forEach((entry, i) => {
    if (entry.isIntersecting) {
      setTimeout(() => {
        entry.target.classList.add('visible');
      }, 80);
      observer.unobserve(entry.target);
    }
  });
}, { threshold: 0.1, rootMargin: '0px 0px -40px 0px' });

revealElements.forEach(el => observer.observe(el));

// ===== STAGGERED CARD REVEAL =====
const projectCards = document.querySelectorAll('.project-card');
projectCards.forEach((card, i) => {
  card.style.transitionDelay = `${i * 80}ms`;
});

const stackGroups = document.querySelectorAll('.stack-group');
stackGroups.forEach((g, i) => {
  g.style.transitionDelay = `${i * 60}ms`;
});

// ===== ACTIVE NAV HIGHLIGHT =====
const sections = document.querySelectorAll('section[id]');
const navLinks = document.querySelectorAll('.nav-links a');

const navObserver = new IntersectionObserver((entries) => {
  entries.forEach(entry => {
    if (entry.isIntersecting) {
      navLinks.forEach(link => {
        link.style.color = '';
        if (link.getAttribute('href') === '#' + entry.target.id) {
          link.style.color = 'var(--text)';
        }
      });
    }
  });
}, { threshold: 0.4 });

sections.forEach(s => navObserver.observe(s));

// ===== NAV SCROLL SHADOW =====
const nav = document.querySelector('.nav');
window.addEventListener('scroll', () => {
  if (window.scrollY > 40) {
    nav.style.borderBottomColor = 'rgba(255,255,255,0.1)';
  } else {
    nav.style.borderBottomColor = '';
  }
}, { passive: true });

// ===== SMOOTH ANCHOR SCROLL =====
document.querySelectorAll('a[href^="#"]').forEach(anchor => {
  anchor.addEventListener('click', e => {
    const target = document.querySelector(anchor.getAttribute('href'));
    if (target) {
      e.preventDefault();
      target.scrollIntoView({ behavior: 'smooth', block: 'start' });
    }
  });
});

// ===== CARD GLOW ON MOUSEMOVE =====
document.querySelectorAll('.project-card').forEach(card => {
  card.addEventListener('mousemove', e => {
    const rect = card.getBoundingClientRect();
    const x = ((e.clientX - rect.left) / rect.width) * 100;
    const y = ((e.clientY - rect.top) / rect.height) * 100;
    card.style.setProperty('--mx', x + '%');
    card.style.setProperty('--my', y + '%');
  });
});

// ===== TYPED EFFECT ON HERO ROLE =====
const role = document.querySelector('.hero-role');
if (role) {
  const phrases = [
    'Aspiring AI / ML Engineer',
    'Web Developer',
    'Problem Solver',
    'Builder'
  ];
  let phraseIndex = 0;
  let charIndex = 0;
  let deleting = false;
  let paused = false;

  function type() {
    if (paused) return;
    const current = phrases[phraseIndex];

    if (!deleting) {
      charIndex++;
      role.textContent = current.slice(0, charIndex);
      if (charIndex === current.length) {
        paused = true;
        setTimeout(() => { paused = false; deleting = true; type(); }, 2200);
        return;
      }
      setTimeout(type, 55);
    } else {
      charIndex--;
      role.textContent = current.slice(0, charIndex);
      if (charIndex === 0) {
        deleting = false;
        phraseIndex = (phraseIndex + 1) % phrases.length;
        setTimeout(type, 400);
        return;
      }
      setTimeout(type, 28);
    }
  }

  // Start after hero animation delay
  setTimeout(type, 1400);
}

// ===== CONSOLE EASTER EGG =====
console.log('%c MSR Portfolio ', 'background:#1D9E75;color:#fff;font-size:14px;padding:4px 12px;border-radius:4px;font-weight:bold;');
console.log('%c Built by Sohaib Rashid · Kanpur · Incoming B.Tech CSE', 'color:#6B7A99;font-size:11px;');
console.log('%c Stack: HTML · CSS · JS  |  AI Tools: Cursor · Grok · Claude', 'color:#3A4560;font-size:10px;');