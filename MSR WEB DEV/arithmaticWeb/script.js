// Page Navigation
document.addEventListener('DOMContentLoaded', function() {
    const navButtons = document.querySelectorAll('.nav-btn');
    const pages = document.querySelectorAll('.page');

    // Add click event to each navigation button
    navButtons.forEach(button => {
        button.addEventListener('click', function() {
            const pageId = this.getAttribute('data-page');
            
            // Remove active class from all buttons and pages
            navButtons.forEach(btn => btn.classList.remove('active'));
            pages.forEach(page => page.classList.remove('active'));
            
            // Add active class to clicked button and corresponding page
            this.classList.add('active');
            document.getElementById(pageId).classList.add('active');
            
            // Clear results when switching pages (optional)
            clearResults();
        });
    });

    // Function to clear all results when switching pages
    function clearResults() {
        const results = document.querySelectorAll('.result');
        results.forEach(result => {
            result.innerHTML = '';
            result.classList.remove('success', 'error');
        });
    }
});

// Addition Function
function calculateAddition() {
    const num1 = parseFloat(document.getElementById('add-num1').value);
    const num2 = parseFloat(document.getElementById('add-num2').value);
    const resultDiv = document.getElementById('add-result');
    
    if (isNaN(num1) || isNaN(num2)) {
        showError(resultDiv, 'Please enter both numbers!');
        return;
    }
    
    const sum = num1 + num2;
    showResult(resultDiv, `${num1} + ${num2} = ${sum}`);
}

// Subtraction Function
function calculateSubtraction() {
    const num1 = parseFloat(document.getElementById('sub-num1').value);
    const num2 = parseFloat(document.getElementById('sub-num2').value);
    const resultDiv = document.getElementById('sub-result');
    
    if (isNaN(num1) || isNaN(num2)) {
        showError(resultDiv, 'Please enter both numbers!');
        return;
    }
    
    const difference = num1 - num2;
    showResult(resultDiv, `${num1} - ${num2} = ${difference}`);
}

// Multiplication Function
function calculateMultiplication() {
    const num1 = parseFloat(document.getElementById('mul-num1').value);
    const num2 = parseFloat(document.getElementById('mul-num2').value);
    const resultDiv = document.getElementById('mul-result');
    
    if (isNaN(num1) || isNaN(num2)) {
        showError(resultDiv, 'Please enter both numbers!');
        return;
    }
    
    const product = num1 * num2;
    showResult(resultDiv, `${num1} × ${num2} = ${product}`);
}

// Division Function
function calculateDivision() {
    const num1 = parseFloat(document.getElementById('div-num1').value);
    const num2 = parseFloat(document.getElementById('div-num2').value);
    const resultDiv = document.getElementById('div-result');
    
    if (isNaN(num1) || isNaN(num2)) {
        showError(resultDiv, 'Please enter both numbers!');
        return;
    }
    
    if (num2 === 0) {
        showError(resultDiv, 'Error: Cannot divide by zero!');
        return;
    }
    
    const quotient = num1 / num2;
    showResult(resultDiv, `${num1} ÷ ${num2} = ${quotient}`);
}

// Modulus Function
function calculateModulus() {
    const num1 = parseFloat(document.getElementById('mod-num1').value);
    const num2 = parseFloat(document.getElementById('mod-num2').value);
    const resultDiv = document.getElementById('mod-result');
    
    if (isNaN(num1) || isNaN(num2)) {
        showError(resultDiv, 'Please enter both numbers!');
        return;
    }
    
    if (num2 === 0) {
        showError(resultDiv, 'Error: Cannot calculate modulus with zero!');
        return;
    }
    
    const remainder = num1 % num2;
    showResult(resultDiv, `${num1} % ${num2} = ${remainder}`);
}

// Helper function to show success result
function showResult(element, message) {
    element.innerHTML = `<span style="font-size: 1.1em;">✅ Result: ${message}</span>`;
    element.classList.remove('error');
    element.classList.add('success');
}

// Helper function to show error message
function showError(element, message) {
    element.innerHTML = `<span style="font-size: 1.1em;">⚠️ ${message}</span>`;
    element.classList.remove('success');
    element.classList.add('error');
}

// Optional: Add keyboard support (press Enter to calculate)
document.addEventListener('keypress', function(event) {
    if (event.key === 'Enter') {
        const activePage = document.querySelector('.page.active');
        const pageId = activePage.id;
        
        switch(pageId) {
            case 'addition':
                calculateAddition();
                break;
            case 'subtraction':
                calculateSubtraction();
                break;
            case 'multiplication':
                calculateMultiplication();
                break;
            case 'division':
                calculateDivision();
                break;
            case 'modulus':
                calculateModulus();
                break;
        }
    }
});

// Add input validation for number fields (optional)
const numberInputs = document.querySelectorAll('input[type="number"]');
numberInputs.forEach(input => {
    input.addEventListener('input', function() {
        // Clear result when user starts typing new numbers
        const parentCard = this.closest('.calculator-card');
        if (parentCard) {
            const resultDiv = parentCard.querySelector('.result');
            if (resultDiv) {
                resultDiv.innerHTML = '';
                resultDiv.classList.remove('success', 'error');
            }
        }
    });
});