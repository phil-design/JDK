/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * Use and Distribution is subject to the Java Research License available
 * at <http://wwws.sun.com/software/communitysource/jrl.html>.
 */

package com.sun.source.tree;

/**
 * A tree node for a 'while' loop statement.
 *
 * For example:
 * <pre>
 *   while ( <em>condition</em> )
 *     <em>statement</em>
 * </pre>
 *
 *
 * @see "The Java Language Specification, 3rd ed, section 14.12"
 *
 * @author Peter von der Ah&eacute;
 * @author Jonathan Gibbons
 * @since 1.6
 */
public interface WhileLoopTree extends StatementTree {
    ExpressionTree getCondition();
    StatementTree getStatement();
}
