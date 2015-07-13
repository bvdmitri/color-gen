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

import java.awt.*;

public class ColorString {
    private ColorStringHashGenerator hashGenerator;
    private HSBGenerator hsbGenerator;

    public ColorString(ColorStringHashGenerator hashGenerator) {
        this.hashGenerator = hashGenerator;
        this.hsbGenerator = HSBGenerator.STANDART;
    }

    public ColorString(HSBGenerator hsbGenerator) {
        this.hashGenerator = ColorStringHashGenerator.STANDART;
        this.hsbGenerator = hsbGenerator;
    }

    public ColorString() {
        this.hashGenerator = ColorStringHashGenerator.STANDART;
        this.hsbGenerator = HSBGenerator.STANDART;
    }

    public ColorString(ColorStringHashGenerator hashGenerator, HSBGenerator hsbGenerator) {
        this.hashGenerator = hashGenerator;
        this.hsbGenerator = hsbGenerator;
    }

    public void setHashGenerator(ColorStringHashGenerator hashGenerator) {
        this.hashGenerator = hashGenerator;
    }

    public void setHsbGenerator(HSBGenerator hsbGenerator) {
        this.hsbGenerator = hsbGenerator;
    }

    public Color getColor(String seed) {
        return hsbGenerator.hsb(hashGenerator.hash(seed));
    }

    public String getHEXColor(String seed) {
        return "#" + Integer.toHexString(getColor(seed).getRGB()).substring(2, 8);
    }
}
