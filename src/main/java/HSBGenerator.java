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

//float hue, float saturation, float brightness

public abstract class HSBGenerator {
    private static final float goldenRationConjugate = 0.818033988749895f;

    public static final HSBGenerator STANDART = new HSBGenerator() {
        @Override
        public Color hsb(int hash) {
            float h = (nextFloat(hash) + goldenRationConjugate) % 1;
            int k = Math.abs(hash) % 6;
            switch (k) {
                case 0:
                    return Color.getHSBColor(h, 0.85f, 0.65f);
                case 1:
                    return Color.getHSBColor(h, 0.65f, 0.65f);
                case 2:
                    return Color.getHSBColor(h, 0.45f, 0.85f);
                case 3:
                    return Color.getHSBColor(h, 0.45f, 0.7f);
                case 4:
                    return Color.getHSBColor(h, 0.55f, 0.8f);
                case 5:
                    return Color.getHSBColor(h, 0.85f, 0.85f);
                default:
                    return null;
            }
        }

        private float nextFloat(int hash) {
            return Float.parseFloat("0." + String.valueOf(Math.abs(hash)));
        }
    };

    public static final HSBGenerator DARKER = new HSBGenerator() {
        @Override
        public Color hsb(int hash) {
            float h = (nextFloat(hash) + goldenRationConjugate) % 1;
            return Color.getHSBColor(h, 0.45f, 0.45f);
        }

        private float nextFloat(int hash) {
            return Float.parseFloat("0." + String.valueOf(Math.abs(hash)));
        }
    };

    public static final HSBGenerator DARK = new HSBGenerator() {
        @Override
        public Color hsb(int hash) {
            float h = (nextFloat(hash) + goldenRationConjugate) % 1;
            return Color.getHSBColor(h, 0.55f, 0.55f);
        }

        private float nextFloat(int hash) {
            return Float.parseFloat("0." + String.valueOf(Math.abs(hash)));
        }
    };

    public static final HSBGenerator BRIGHT = new HSBGenerator() {
        @Override
        public Color hsb(int hash) {
            float h = (nextFloat(hash) + goldenRationConjugate) % 1;
            return Color.getHSBColor(h, 0.75f, 0.75f);
        }

        private float nextFloat(int hash) {
            return Float.parseFloat("0." + String.valueOf(Math.abs(hash)));
        }
    };

    public static final HSBGenerator BRIGHTER = new HSBGenerator() {
        @Override
        public Color hsb(int hash) {
            float h = (nextFloat(hash) + goldenRationConjugate) % 1;
            return Color.getHSBColor(h, 0.85f, 0.85f);
        }

        private float nextFloat(int hash) {
            return Float.parseFloat("0." + String.valueOf(Math.abs(hash)));
        }
    };

    public static final HSBGenerator MIDDLE = new HSBGenerator() {
        @Override
        public Color hsb(int hash) {
            float h = (nextFloat(hash) + goldenRationConjugate) % 1;
            return Color.getHSBColor(h, 0.65f, 0.65f);
        }

        private float nextFloat(int hash) {
            return Float.parseFloat("0." + String.valueOf(Math.abs(hash)));
        }
    };


    public abstract Color hsb(int hash);
}
