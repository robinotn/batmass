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
package umich.ms.batmass.filesupport.files.types.xcms.peaks.data;

import java.awt.geom.Rectangle2D;
import umich.ms.batmass.data.core.lcms.features.AbstractShapedLCMSTrace;

/**
 *
 * @author Dmitry Avtonomov
 */
public class XCMSTrace extends AbstractShapedLCMSTrace {
    double mzLo;
    double mzHi;

    public XCMSTrace(double mz, double rtLo, double rtHi, double mzLo, double mzHi) {
        super(mz, rtLo, rtHi);
        this.mzLo = mzLo;
        this.mzHi = mzHi;
        this.spread = mzHi - mzLo;
        this.shape = new Rectangle2D.Double(mzLo, rtHi, mzHi-mzLo, rtHi-rtLo);
    }
    
}
