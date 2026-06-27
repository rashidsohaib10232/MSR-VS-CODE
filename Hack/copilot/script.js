// Theme Toggle with localStorage persistence
const themeToggle = document.getElementById("theme-toggle");
const body = document.body;

// Load saved theme
if (localStorage.getItem("theme") === "dark") {
  body.classList.add("dark");
  themeToggle.textContent = "☀️";
}

// Toggle theme
themeToggle.addEventListener("click", () => {
  body.classList.toggle("dark");
  if (body.classList.contains("dark")) {
    localStorage.setItem("theme", "dark");
    themeToggle.textContent = "☀️";
  } else {
    localStorage.setItem("theme", "light");
    themeToggle.textContent = "🌙";
  }
});

// Smooth Scroll for nav links
document.querySelectorAll(".nav-links a").forEach(link => {
  link.addEventListener("click", e => {
    e.preventDefault();
    const targetId = link.getAttribute("href").substring(1);
    const targetSection = document.getElementById(targetId);
    targetSection.scrollIntoView({ behavior: "smooth" });
  });
});

// Contact Form Validation
const form = document.getElementById("contact-form");
const formMessage = document.getElementById("form-message");

form.addEventListener("submit", e => {
  e.preventDefault();

  const name = document.getElementById("name").value.trim();
  const email = document.getElementById("email").value.trim();
  const message = document.getElementById("message").value.trim();

  if (!name || !email || !message) {
    formMessage.textContent = "⚠️ Please fill in all fields.";
    formMessage.style.color = "red";
    return;
  }

  // Simple email regex
  const emailPattern = /^[^ ]+@[^ ]+\.[a-z]{2,3}$/;
  if (!email.match(emailPattern)) {
    formMessage.textContent = "⚠️ Please enter a valid email.";
    formMessage.style.color = "red";
    return;
  }

  // Success message
  formMessage.textContent = "✅ Message sent successfully!";
  formMessage.style.color = "green";

  // Reset form
  form.reset();
});
