// =========================================================
// NexaAI — Interactions
// =========================================================

(function () {
  'use strict';

  /* ---------- Theme toggle (persisted via localStorage) ---------- */
  const root = document.documentElement;
  const themeToggle = document.getElementById('themeToggle');
  const THEME_KEY = 'nexaai-theme';

  function applyTheme(theme) {
    root.setAttribute('data-theme', theme);
    themeToggle.setAttribute('aria-pressed', theme === 'dark');
    themeToggle.setAttribute(
      'aria-label',
      theme === 'dark' ? 'Switch to light mode' : 'Switch to dark mode'
    );
  }

  const storedTheme = localStorage.getItem(THEME_KEY);
  const prefersDark = window.matchMedia('(prefers-color-scheme: dark)').matches;
  applyTheme(storedTheme || (prefersDark ? 'dark' : 'light'));

  themeToggle.addEventListener('click', function () {
    const next = root.getAttribute('data-theme') === 'dark' ? 'light' : 'dark';
    applyTheme(next);
    localStorage.setItem(THEME_KEY, next);
  });

  /* ---------- Mobile nav toggle ---------- */
  const navToggle = document.getElementById('navToggle');
  const navMenu = document.getElementById('navMenu');

  navToggle.addEventListener('click', function () {
    const isOpen = navMenu.classList.toggle('open');
    navToggle.setAttribute('aria-expanded', String(isOpen));
  });

  navMenu.querySelectorAll('a').forEach(function (link) {
    link.addEventListener('click', function () {
      navMenu.classList.remove('open');
      navToggle.setAttribute('aria-expanded', 'false');
    });
  });

  /* ---------- Smooth scroll for in-page links ---------- */
  document.querySelectorAll('a[href^="#"]').forEach(function (link) {
    link.addEventListener('click', function (e) {
      const targetId = link.getAttribute('href');
      if (targetId.length < 2) return;
      const target = document.querySelector(targetId);
      if (!target) return;
      e.preventDefault();
      target.scrollIntoView({ behavior: 'smooth', block: 'start' });
      target.setAttribute('tabindex', '-1');
      target.focus({ preventScroll: true });
    });
  });

  /* ---------- Footer year ---------- */
  const yearEl = document.getElementById('year');
  if (yearEl) yearEl.textContent = new Date().getFullYear();

  /* ---------- Contact form validation ---------- */
  const form = document.getElementById('contactForm');
  const successMsg = document.getElementById('formSuccess');
  const errorMsg = document.getElementById('formError');

  const fields = {
    fullName: {
      input: document.getElementById('fullName'),
      error: document.getElementById('fullNameError'),
      validate: function (value) {
        return value.trim().length >= 2 ? '' : 'Please enter your full name.';
      },
    },
    email: {
      input: document.getElementById('email'),
      error: document.getElementById('emailError'),
      validate: function (value) {
        const pattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        return pattern.test(value.trim()) ? '' : 'Please enter a valid email address.';
      },
    },
    message: {
      input: document.getElementById('message'),
      error: document.getElementById('messageError'),
      validate: function (value) {
        return value.trim().length >= 10 ? '' : 'Message should be at least 10 characters.';
      },
    },
  };

  function validateField(field) {
    const message = field.validate(field.input.value);
    field.error.textContent = message;
    field.input.setAttribute('aria-invalid', message ? 'true' : 'false');
    return !message;
  }

  Object.values(fields).forEach(function (field) {
    field.input.addEventListener('blur', function () { validateField(field); });
    field.input.addEventListener('input', function () {
      if (field.input.getAttribute('aria-invalid') === 'true') validateField(field);
    });
  });

  form.addEventListener('submit', function (e) {
    e.preventDefault();
    successMsg.hidden = true;
    errorMsg.hidden = true;

    const results = Object.values(fields).map(validateField);
    const isValid = results.every(Boolean);

    if (!isValid) {
      errorMsg.hidden = false;
      const firstInvalid = Object.values(fields).find(
        function (f) { return f.input.getAttribute('aria-invalid') === 'true'; }
      );
      if (firstInvalid) firstInvalid.input.focus();
      return;
    }

    // Placeholder for a real submission (e.g. fetch to an API endpoint).
    successMsg.hidden = false;
    form.reset();
    Object.values(fields).forEach(function (field) {
      field.input.removeAttribute('aria-invalid');
      field.error.textContent = '';
    });
  });

  /* ---------- Header background on scroll ---------- */
  const header = document.querySelector('.site-header');
  function updateHeaderShadow() {
    header.style.boxShadow = window.scrollY > 8 ? '0 4px 20px -10px rgba(15,23,42,0.25)' : 'none';
  }
  window.addEventListener('scroll', updateHeaderShadow, { passive: true });
  updateHeaderShadow();
})();