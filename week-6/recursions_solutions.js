/**
 * Divide and Conquer
 * Recursion
 * Memoization
 */

/**
 * Top down
 * Bottom up
 * 
 */


/**
 * Problem1: Add all the natural/counting numbers up to the number provided
 * i.e. : 
 * add(5) = 1 + 2 + 3 + 4 + 5 = 15
 * add(6) = 1 + 2 + 3 + 4 + 5 + 6 = 21
 * add(6) = add(5) + 6 = 21
 *  
 */

 function add(number) {
  var total = 0;
  for (var curr=1; curr<=number; curr++) {
    total = total + curr;
  }
  return total;
}

function addRecursion(number) {

  // Base
  if (number == 0) {
    return 0;
  }
  // Convergence
  var nextNumber = number-1;
  // Recursion
  var subproblem = addRecursion(nextNumber);          
  return number + subproblem;
}

function addRecursion2(number) {
  return number == 0 ?
   0 : 
   number + addRecursion(number-1);
}


console.log("add: " + add(6));
console.log("addRecursion: " + addRecursion(6));
console.log("addRecursion2: " + addRecursion2(6));



/**
 * Problem2: Print all Fibonacci numbers 
 * 
 * 0 1 2 3 4 5 6 7  8  9
 * 0 1 1 2 3 5 8 13 21 34 ...
 * F(0) = 0
 * F(1) = 1
 * F(n) = F(n-1) + F(n-2)
 */

 function getNthFibonacci(n) {
  if (n == 0) {
    return 0;
  }
  if (n == 1) {
    return 1;
  }
  var prevPrev = 0;
  var prev = 1;
  var currentNumber;
  for (var i = 2; i <= n; i++) {
      currentNumber = prevPrev + prev;
      prevPrev = prev;
      prev = currentNumber;
  } 
  return currentNumber;
}

function getNthFibonacciRecursion(n) {

  if (n == 0) {
    return 0;
  }
  if (n == 1) {
    return 1;
  }
  var current = getNthFibonacciRecursion(n-1) + getNthFibonacciRecursion(n-2);
  return current; 
}

function getNthFibonacciRecursion2(n) {
  return n < 2 ? n : getNthFibonacciRecursion2(n-1) + getNthFibonacciRecursion2(n-2); 
}

var memory = {};
function getNthFibonacciRecursionWithMemoization(n) {
  if (n<2) return n;
  // Memoization 
  if (memory[n]) return memory[n];  
  memory[n] = getNthFibonacciRecursionWithMemoization(n-1) + getNthFibonacciRecursionWithMemoization(n-2)
  return memory[n]; 
}

console.log("getNthFibonacci: " + getNthFibonacci(6));
var time1 = Date.now();
console.log("getNthFibonacciRecursion: " + getNthFibonacciRecursion(40), (Date.now() - time1));
var time2 = Date.now();
console.log("getNthFibonacciRecursion2: " + getNthFibonacciRecursion2(40),(Date.now() - time2));
var time2 = Date.now();
console.log("getNthFibonacciRecursionWithMemoization: " + getNthFibonacciRecursionWithMemoization(40),(Date.now() - time2));


/**
 * Problem3: Find minimum element in Array
 * A = [ 1, 4, 45, 6, -50, 10, 2 ]
 * result -50;
 */
 
function findMinInArray(A, len)
{  
  // If size = 0 means whole
  // array has been traversed
  if (len == 1)
    return A[0];
         
  return Math.min(A[len - 1], findMinInArray(A, len - 1));
}
 
var A = [ 1, 4, 45, 6, -50, 10, 2 ];
var n = A.length;
 
console.log("findMinInArray: " + findMinInArray(A, n));


/**
 * Sample execution output
 * 
 * add: 21
 * addRecursion: 21
 * addRecursion2: 21
 * getNthFibonacci: 8
 * getNthFibonacciRecursion: 832040 15
 * getNthFibonacciRecursion2: 832040 13
 * findMinInArray: -50
 */