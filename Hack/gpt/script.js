// Theme Toggle

const themeToggle = document.getElementById("themeToggle");

const savedTheme = localStorage.getItem("theme");

if (savedTheme) {
  document.documentElement.setAttribute(
    "data-theme",
    savedTheme
  );

  themeToggle.textContent =
    savedTheme === "dark" ? "☀️" : "🌙";
}

themeToggle.addEventListener("click", () => {
  const currentTheme =
    document.documentElement.getAttribute(
      "data-theme"
    );

  if (currentTheme === "dark") {
    document.documentElement.removeAttribute(
      "data-theme"
    );

    localStorage.setItem("theme", "light");
    themeToggle.textContent = "🌙";
  } else {
    document.documentElement.setAttribute(
      "data-theme",
      "dark"
    );

    localStorage.setItem("theme", "dark");
    themeToggle.textContent = "☀️";
  }
});

// Contact Form Validation

const form = document.getElementById("contactForm");
const formMessage =
  document.getElementById("formMessage");

form.addEventListener("submit", (e) => {
  e.preventDefault();

  const name =
    document.getElementById("name").value.trim();

  const email =
    document.getElementById("email").value.trim();

  const message =
    document.getElementById("message").value.trim();

  if (!name || !email || !message) {
    formMessage.textContent =
      "Please fill in all fields.";
    formMessage.style.color = "red";
    return;
  }

  const emailPattern =
    /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

  if (!emailPattern.test(email)) {
    formMessage.textContent =
      "Please enter a valid email.";
    formMessage.style.color = "red";
    return;
  }

  formMessage.textContent =
    "Message sent successfully!";
  formMessage.style.color = "green";

  form.reset();
});