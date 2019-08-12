/**
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
 */
package io.journalkeeper.sql.state;

import io.journalkeeper.core.api.State;
import io.journalkeeper.core.api.StateFactory;
import io.journalkeeper.sql.client.domain.ReadRequest;
import io.journalkeeper.sql.client.domain.Response;
import io.journalkeeper.sql.client.domain.WriteRequest;

/**
 * SQLStateFactory
 * author: gaohaoxiang
 * date: 2019/8/2
 */
public class SQLStateFactory implements StateFactory<WriteRequest, ReadRequest, Response> {

    @Override
    public State<WriteRequest, ReadRequest, Response> createState() {
        return new SQLState(this);
    }
}