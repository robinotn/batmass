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
package umich.ms.batmass.projects.types.metabolomics;

import javax.swing.ImageIcon;
import org.netbeans.api.annotations.common.StaticResource;
import org.netbeans.spi.project.ProjectState;
import org.openide.filesystems.FileObject;
import org.openide.util.ImageUtilities;
import umich.ms.batmass.projects.core.annotations.BMProjectType;
import umich.ms.batmass.projects.core.type.BMProject;
import umich.ms.batmass.projects.core.type.BMProjectLogicalView;

/**
 *
 * @author Dmitry Avtonomov
 */
@BMProjectType(projectType = "MetabolomicsProject")
public class MetabolomicsProject extends BMProject {

    public static final String PROJECT_DIR = "batmassproject";
    public static final String PROJECT_PROPFILE = "metabolomics.properties";
    public static final @StaticResource String ICON_PATH = "umich/ms/batmass/projects/types/metabolomics/icons/Me_project_16.png";
    protected static final ImageIcon ICON = new ImageIcon(ImageUtilities.loadImage(ICON_PATH));
    public static final String TYPE = "MetabolomicsProject";

    public MetabolomicsProject(FileObject projectDir, ProjectState projectState) {
        super(projectDir, projectState);
        addToLookup(new BMProjectLogicalView(this));
    }

    @Override
    public ImageIcon getIcon() {
        return ICON;
    }

    @Override
    public String getProjectPropsDirectoryPath() {
        return PROJECT_DIR;
    }

    @Override
    public String getProjectPropsFileName() {
        return PROJECT_PROPFILE;
    }
}
