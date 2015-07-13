/**
 * Created by bvdmitri on 10.07.15.
 * <p>
 * The MIT License (MIT)
 * <p>
 * Copyright (c) 2015 Bagaev Dmitri
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

public abstract class ColorStringHashGenerator {

    public static final ColorStringHashGenerator STANDART = new ColorStringHashGenerator() {
        @Override
        public int hash(String str) {
            int p = 458489;
            int hash = 930937;

            for (byte b : str.getBytes()) {
                hash = (hash * hash + (b * p) + p) % 100000;
                p *= p;

            }
            return hash;
        }
    };

    public abstract int hash(String str);

}
