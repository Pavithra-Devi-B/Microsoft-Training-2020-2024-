bool isPalindrome(int x){
    if (x < 0) {
        return false;
    }    
    int x_copy;
    char mover;
    unsigned int x_reversed;
    
    x_reversed = 0;
    x_copy = x;
    while (x_copy > 0) {
        //chop off the last digit of x
        mover = x_copy % 10;
        x_copy = x_copy / 10;
        x_reversed = x_reversed * 10 + mover;
    }
    if (x == x_reversed) {
        return true;
    } else {
        return false;
    }
}
