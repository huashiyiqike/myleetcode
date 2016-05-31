/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
/**
 * @param {string} s
 * @param {string} p
 * @return {boolean}
 */
/**
 * @param {string} s
 * @param {string} p
 * @return {boolean}
 */
/**
 * @param {string} digits
 * @return {string[]}
 */
/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    var stack = [];
    for(var i = 0;i < s.length;i++){
        switch(s[i]){
            case '(': stack.push('(');break; 
            case '[': stack.push('[');break; 
            case '{': stack.push('{');break; 
            case ')': if(stack.length <= 0 || (stack.length > 0 &&
             stack[stack.length - 1] !== '(')) {return false;}
             stack.pop();break; 
            case ']': if(stack.length <= 0 || (stack.length > 0 &&
             stack[stack.length - 1] !== '[')) {return false;}
            stack.pop();break; 
            case '}': if(stack.length <= 0 || (stack.length > 0 &&
             stack[stack.length - 1] !== '{')) {return false;}
            stack.pop();break;  
        } 
    }
    return stack.length == 0;
};


/**
 * Your NestedIterator will be called like this:
 * var i = new NestedIterator(nestedList), a = [];
 * while (i.hasNext()) a.push(i.next());
*/
var m  = isValid("()[]{}");
console.log(m); 
