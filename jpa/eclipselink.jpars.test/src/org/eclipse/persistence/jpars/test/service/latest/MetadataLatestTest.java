/*******************************************************************************
 * Copyright (c) 2014, 2015  Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *         Dmitry Kornilov - Initial implementation
 ******************************************************************************/
package org.eclipse.persistence.jpars.test.service.latest;

import org.eclipse.persistence.jpa.rs.resources.MetadataResource;
import org.eclipse.persistence.jpars.test.service.v2.MetadataTest;
import org.junit.BeforeClass;

/**
 * A set of metadata tests.
 *
 * @author Dmitry Kornilov
 * @since EclipseLink 2.6.0
 */
public class MetadataLatestTest extends MetadataTest {

    @BeforeClass
    public static void setup() throws Exception {
        initContext("jpars_employee-static", "latest");
        metadataResource = new MetadataResource();
        metadataResource.setPersistenceFactory(factory);
    }
}
