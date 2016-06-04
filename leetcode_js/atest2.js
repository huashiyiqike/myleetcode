/**
 * @param {number} dividend
 * @param {number} divisor
 * @return {number}
 */
/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var nextPermutation = function(nums) {
    for(var i = nums.length - 2; i >= 0; i--){
        for(var j = nums.length - 1; j > i; j--){
            if(nums[i] < nums[j]){
                var tmp = nums[j];
                nums[j] = nums[i];
                nums[i] = tmp;
                tmp = nums.slice(i + 1).reverse();
                nums.splice(i + 1, tmp.length);
                for(var i in tmp){
                    nums.push(tmp[i]);
                } 
                return;
            }
        }
    }
    nums = nums.reverse();
};
/**
 * Your NestedIterator will be called like this:
 * var i = new NestedIterator(nestedList), a = [];
 * while (i.hasNext()) a.push(i.next());
*/
var n = [1,2];
var m  = nextPermutation(n);
console.log(m); 
