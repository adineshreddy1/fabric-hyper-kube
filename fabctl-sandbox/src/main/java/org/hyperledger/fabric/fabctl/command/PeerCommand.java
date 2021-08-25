package org.hyperledger.fabric.fabctl.command;

import lombok.Data;

public class PeerCommand extends FabricCommand
{
    public PeerCommand(final String... command)
    {
        super("hyperledger/fabric-peer", command);
    }
}
