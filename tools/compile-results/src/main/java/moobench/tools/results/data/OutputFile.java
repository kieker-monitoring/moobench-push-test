/***************************************************************************
 * Copyright (C) 2022 Kieker (https://kieker-monitoring.net)

 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/
package moobench.tools.results.data;

import java.nio.file.Path;

/**
 * Pass down file path and content for the file to a data sink.
 *
 * @author Reiner Jung
 * @since 1.3.0
 */
public class OutputFile {

    Path filePath;
    String content;

    public OutputFile(final Path filePath, final String content) {
        this.filePath = filePath;
        this.content = content;
    }

    public Path getFilePath() {
        return this.filePath;
    }

    public String getContent() {
        return this.content;
    }

}
