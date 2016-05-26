/*
 * Copyright 2016 Dmitry Avtonomov.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package umich.ms.batmass.gui.viewers.map2d.norm;

/**
 *
 * @author Dmitry Avtonomov
 */
public class DoNothingRangeNormalizer implements RangeNormalizer {

    @Override
    public double getScaled(double x) {
        return x;
    }

    @Override
    public double getOriginal(double x) {
        return x;
    }

    @Override
    public boolean equals(RangeNormalizer other) {
        return other instanceof DoNothingRangeNormalizer;
    }

    @Override
    public void configure(double maxValue, double minNonZeroValue, double targetRange) {
        
    }
    
}
