/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.shootercheng.export.common;

/**
 * Constants for this package.
 */
public final class Constants {

    static final char BACKSLASH = '\\';

    static final char BACKSPACE = '\b';

    static final char COMMA = ',';

    /**
     * Starts a comment, the remainder of the line is the comment.
     */
    static final char COMMENT = '#';

    static final char CR = '\r';

    /** RFC 4180 defines line breaks as CRLF */
    public static final String CRLF = "\r\n";

    static final Character DOUBLE_QUOTE_CHAR = Character.valueOf('"');

    static final String EMPTY = "";

    /** The end of stream symbol */
    static final int END_OF_STREAM = -1;

    static final char FF = '\f';

    static final char LF = '\n';

    /**
     * Unicode line separator.
     */
    static final String LINE_SEPARATOR = "\u2028";

    /**
     * Unicode next line.
     */
    static final String NEXT_LINE = "\u0085";

    /**
     * Unicode paragraph separator.
     */
    static final String PARAGRAPH_SEPARATOR = "\u2029";

    static final char PIPE = '|';

    /** ASCII record separator */
    static final char RS = 30;

    static final char SP = ' ';

    static final char TAB = '\t';

    /** Undefined state for the lookahead char */
    static final int UNDEFINED = -2;

    /** ASCII unit separator */
    static final char US = 31;

    /**
     * page query size
     */
    public static final String PAGE_QUERY_SIZE = "pageSize";

    /**
     * page query start index
     */
    public static final String PADE_QUERY_INDEX = "startIndex";

    public static final String EXCEL_XLS = ".xls";
    public static final String EXCEL_XLSX = ".xlsx";

    public static final int EXCEL_MAX_ROW_XLS = 65535;

    public static final int EXCEL_MAX_ROW_XLSX = 1048575;

    public static final Object[] NO_ARGUMENTS = new Object[0];
}
