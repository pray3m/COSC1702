public class MyStringBuilder1 {
    private char[] value;
    private int count;

    public MyStringBuilder1(String s) {
        if (s == null) {
            throw new NullPointerException("Input string cannot be null");
        }
        this.value = new char[s.length() + 16];
        for (int i = 0; i < s.length(); i++) {
            this.value[i] = s.charAt(i);
        }
        this.count = s.length();
    }

    // Append another MyStringBuilder1
    public MyStringBuilder1 append(MyStringBuilder1 s) {
        if (s == null) {
            throw new NullPointerException("Input MyStringBuilder1 cannot be null");
        }
        ensureCapacity(this.count + s.count);
        for (int i = 0; i < s.count; i++) {
            this.value[this.count++] = s.value[i];
        }
        return this;
    }

    public MyStringBuilder1 append(int i) {
        String intString = Integer.toString(i);
        return append(new MyStringBuilder1(intString));
    }

    public int length() {
        return this.count;
    }

    // Returns the character at the specified index
    public char charAt(int index) {
        if (index < 0 || index >= this.count) {
            throw new StringIndexOutOfBoundsException("Index: " + index + ", Length: " + this.count);
        }
        return this.value[index];
    }

    public MyStringBuilder1 toLowerCase() {
        for (int i = 0; i < this.count; i++) {
            if (this.value[i] >= 'A' && this.value[i] <= 'Z') {
                this.value[i] = (char) (this.value[i] + ('a' - 'A'));
            }
        }
        return this;
    }

    // Returns a substring from begin (inclusive) to end (exclusive)
    public MyStringBuilder1 substring(int begin, int end) {
        if (begin < 0 || end > this.count || begin > end) {
            throw new StringIndexOutOfBoundsException("Begin: " + begin + ", End: " + end + ", Length: " + this.count);
        }
        StringBuilder sb = new StringBuilder(end - begin);
        for (int i = begin; i < end; i++) {
            sb.append(this.value[i]);
        }
        return new MyStringBuilder1(sb.toString());
    }

    @Override
    public String toString() {
        return new String(this.value, 0, this.count);
    }

    // Ensures that the capacity is sufficient to hold additional characters
    private void ensureCapacity(int minimumCapacity) {
        if (minimumCapacity - this.value.length > 0) {
            int newCapacity = this.value.length * 2 + 2;
            if (newCapacity - minimumCapacity < 0) {
                newCapacity = minimumCapacity;
            }
            char[] newValue = new char[newCapacity];
            for (int i = 0; i < this.count; i++) {
                newValue[i] = this.value[i];
            }
            this.value = newValue;
        }
    }
}
