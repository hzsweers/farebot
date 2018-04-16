/*
 * AtHopStubTransitFactory.java
 *
 * Copyright 2015 Michael Farrell <micolous+git@gmail.com>
 * Copyright 2016 Eric Butler <eric@codebutler.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.codebutler.farebot.transit.stub;

import android.support.annotation.NonNull;
import com.codebutler.farebot.card.desfire.DesfireCard;
import com.codebutler.farebot.transit.TransitFactory;
import com.codebutler.farebot.transit.TransitIdentity;
import com.codebutler.farebot.transit.registry.annotations.TransitCard;

@TransitCard
public class AtHopStubTransitFactory implements TransitFactory<DesfireCard, AtHopStubTransitInfo> {

    @Override
    public boolean check(@NonNull DesfireCard card) {
        return (card.getApplication(0x4055) != null) && (card.getApplication(0xffffff) != null);
    }

    @NonNull
    @Override
    public TransitIdentity parseIdentity(@NonNull DesfireCard card) {
        return TransitIdentity.create("AT HOP", null);
    }

    @NonNull
    @Override
    public AtHopStubTransitInfo parseInfo(@NonNull DesfireCard card) {
        return AtHopStubTransitInfo.create();
    }
}
