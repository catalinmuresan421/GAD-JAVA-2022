package com.company.lab1;

public class Ch2 {

    public static class Foobar {
        public String compute(int n) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                    stringBuilder.append("FooBarQix");
                } else if (i % 3 == 0 && i % 7 == 0) {
                    stringBuilder.append("FooQix");
                } else if (i % 3 == 0 && i % 5 == 0) {
                    stringBuilder.append("FooBar");
                } else if (i % 5 == 0 && i % 7 == 0) {
                    stringBuilder.append("BarQix");
                } else if (i % 3 == 0) {
                    stringBuilder.append("Foo");
                } else if (i % 5 == 0) {
                    stringBuilder.append("Bar");
                } else if (i % 7 == 0) {
                    stringBuilder.append("Qix");
                }
                if (contains3(i)) {
                    stringBuilder.append("Foo");
                }
                if (contains5(i)) {
                    stringBuilder.append("Bar");
                }
                if (contains7(i)) {
                    stringBuilder.append("Qix");
                }
                if (contains0(i)) {
                    stringBuilder.append("*");
                }
                stringBuilder.append(" ");
                stringBuilder.append(i); //accessing after every loop, showing i after computing
                stringBuilder.append(" ");

            }
            return stringBuilder.toString();
        }

        public int getDigits(int n) {
            int result = 0;
            while (n > 0) {
                int digit = n % 10;
                result += digit;
                n /= 10;
            }
            return result;
        }

        public boolean contains3(int n) {
            int x = getDigits(n);
            boolean result = false;
            while (x > 0) {
                if (x % 10 == 3) {
                    result = true;
                    break;
                }
                x = x / 10;
            }
            return result;

        }

        public boolean contains5(int n) {

            int x = getDigits(n);
            boolean result = false;
            while (x > 0) {
                if (x % 10 == 5) {
                    result = true;
                    break;
                }
                x = x / 10;
            }
            return result;

        }

        public boolean contains7(int n) {

            int x = getDigits(n);
            boolean result = false;
            while (x > 0) {
                if (x % 10 == 7) {
                    result = true;
                    break;
                }
                x = x / 10;
            }
            return result;

        }

        public boolean contains0(int n) {
            boolean result = false;
            while (n > 0) {
                if (n % 10 == 0) {
                    result = true;
                    break;
                }
                n = n / 10;
            }
            return result;
        }


        public static void main(String[] args) {
            Foobar fooBar = new Foobar();
            System.out.println(fooBar.compute(100));
        }


    }
}
