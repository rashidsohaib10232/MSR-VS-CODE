// Dark Mode Toggle
const toggleBtn = document.getElementById("theme-toggle");
toggleBtn.addEventListener("click", () => {
  document.body.classList.toggle("dark");
});

// Search Filter
const searchInput = document.getElementById("search");
const cards = document.querySelectorAll(".bookmark-card");
const counter = document.getElementById("counter");

function updateCounter() {
  const visible = [...cards].filter(card => card.style.display !== "none").length;
  counter.textContent = `Showing ${visible} bookmarks`;
}
updateCounter();

searchInput.addEventListener("input", () => {
  const query = searchInput.value.toLowerCase();
  cards.forEach(card => {
    const text = card.textContent.toLowerCase();
    card.style.display = text.includes(query) ? "block" : "none";
  });
  updateCounter();
});