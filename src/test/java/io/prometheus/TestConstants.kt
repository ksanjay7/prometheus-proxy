/*
 * Copyright © 2018 Paul Ambrose (pambrose@mac.com)
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
 */

package io.prometheus

import java.util.*
import java.util.concurrent.Executors.newCachedThreadPool

object TestConstants {
    internal val EXECUTOR_SERVICE = newCachedThreadPool()
    internal val RANDOM = Random()
    internal val REPS = 1000
    internal val PROXY_PORT = 9505
    internal val args = listOf("--config", "https://raw.githubusercontent.com/pambrose/prometheus-proxy/master/etc/test-configs/travis.conf")
}