function sleep(ms) {
    return new Promise(resolve => setTimeout(resolve, ms));
}

async function bubbleSort(arr) {
    const n = arr.length;
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
                await sleep(100); // Adjust the sleep duration for visualization speed
                renderArray(arr);
            }
        }
    }
}

function renderArray(arr) {
    const sortingContainer = document.getElementById("sortingContainer");
    sortingContainer.innerHTML = "";

    for (let i = 0; i < arr.length; i++) {
        const bar = document.createElement("div");
        bar.style.height = arr[i] + "px";
        bar.classList.add("sorting-bar");
        sortingContainer.appendChild(bar);
    }
}

function generateRandomArray(size, maxHeight) {
    const arr = [];
    for (let i = 0; i < size; i++) {
        arr.push(Math.floor(Math.random() * maxHeight) + 1);
    }
    return arr;
}

async function startSorting() {
    const arraySize = 50; // You can adjust the size of the array
    const maxHeight = 300; // You can adjust the maximum height of the bars

    const randomArray = generateRandomArray(arraySize, maxHeight);
    renderArray(randomArray);

    await bubbleSort(randomArray); // Change to another sorting algorithm if needed
}

startSorting();
