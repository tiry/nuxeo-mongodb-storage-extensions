/*
 * (C) Copyright 2014 Nuxeo SA (http://nuxeo.com/) and contributors.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *     Tiry
 *
 */
package org.nuxeo.mongodb.seq.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.nuxeo.ecm.core.test.CoreFeature;
import org.nuxeo.ecm.core.uidgen.UIDGeneratorService;
import org.nuxeo.ecm.core.uidgen.UIDSequencer;
import org.nuxeo.mongodb.seq.MongoDBSequencer;
import org.nuxeo.runtime.api.Framework;
import org.nuxeo.runtime.test.runner.Deploy;
import org.nuxeo.runtime.test.runner.Features;
import org.nuxeo.runtime.test.runner.FeaturesRunner;
import org.nuxeo.runtime.test.runner.LocalDeploy;

@Deploy({ "org.nuxeo.ecm.platform.uidgen.core" })
@RunWith(FeaturesRunner.class)
@Features({ CoreFeature.class })
@LocalDeploy({ "org.nuxeo.mongodb.extensions:OSGI-INF/mongodb-uidgen-sequencer-contrib.xml" })
public class TestMongoDBSeq {

    @Test
    public void testSeq() {

        Framework.getProperties().put("nuxeo.mongodb.server", "localhost");
        Framework.getProperties().put("nuxeo.mongodb.dbname", "nuxeo");

        UIDGeneratorService service = Framework.getService(UIDGeneratorService.class);
        UIDSequencer seq = service.getSequencer("uidgenMongo");

        seq.initSequence("A", 0);
        seq.initSequence("B", 0);

        Assert.assertNotNull(seq);
        Assert.assertTrue(seq.getClass().isAssignableFrom(MongoDBSequencer.class));

        Assert.assertEquals(1, seq.getNext("A"));
        Assert.assertEquals(2, seq.getNext("A"));
        Assert.assertEquals(1, seq.getNext("B"));
    }

}
