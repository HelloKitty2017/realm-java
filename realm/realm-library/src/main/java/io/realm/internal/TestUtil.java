/*
 * Copyright 2016 Realm Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.realm.internal;

import java.util.Date;

class TestUtil {

    public static native long getMaxExceptionNumber();

    public static native String getExpectedMessage(long exceptionKind);

    public static native void testThrowExceptions(long exceptionKind);

    /**
     * Returns the Date representation of a Core timestamp
     */
    public static native long getDateFromTimestamp(long seconds, int nanoseconds);
}
