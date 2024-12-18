// Datos de la meta y las ventas actuales
const targetSales = 1700000000; // Meta de ventas
let currentSales = 1497045329; // Ventas actuales (puedes actualizar esto manualmente)

// Función para actualizar el contador de días
function updateCountdown() {
    const targetDate = new Date("2024-12-31T23:59:59"); // Fecha objetivo
    const today = new Date();
    const diff = targetDate - today;
    
    const daysLeft = Math.floor(diff / (1000 * 60 * 60 * 24)); // Días restantes
    document.getElementById("countdown").innerText = `${daysLeft} días restantes`;
}

// Función para actualizar el progreso
function updateProgress() {
    const progress = (currentSales / targetSales) * 440; // Calcula el progreso
    document.getElementById("progress-bar").style.strokeDashoffset = 440 - progress; // Rellena el círculo
    document.getElementById("sales-info").innerText = `Ventas actuales: ${currentSales.toLocaleString()}`;
}

// Llamar las funciones al cargar la página
window.onload = function() {
    updateCountdown();
    updateProgress();
    setInterval(updateCountdown, 1000 * 60 * 60 * 24); // Actualiza el contador cada 24 horas
}
