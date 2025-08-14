var romanToInt = function(s) {
const romanMap = {
    'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000
};
let total = 0;
for(let i = 0; i<s.length; i++)
{
    let cur = romanMap[s[i]];
    let nxt = romanMap[s[i+1]];
    if(nxt && cur<nxt){
        total += nxt-cur;
        i++;
    }else{
        total += cur;
    }
}
return total;

};

console.log(romanToInt("III")); // 3
console.log(romanToInt("IV")); // 4
console.log(romanToInt("IX")); // 9
console.log(romanToInt("LVIII")); // 58
console.log(romanToInt("MCMXCIV")); // 1994
console.log(romanToInt("MMXXIII")); // 2023