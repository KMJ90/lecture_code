// explicit-coercion (명시적 타입 변환)

// 1. 문자열 타입으로 변환

// 1-1. String 생성자 함수를 new 연산자 없이 호출
console.log(String(10));        // "10"
console.log(String(NaN));       // "NaN"
console.log(String(Infinity));  // "Infinity"
console.log(String(true));      // "true"

// 1-2. Object.prototype.toString 메소드 사용
console.log((10).toSrting());       // "10"
console.log((NaN).toSrting());      // "NaN"
console.log((Infinity).toSrting()); // "Infinity"
console.log((true).toSrting());     // "true"

// 1-3. 문자열 연결 연산자 (+) 이용 - 암묵적 변환