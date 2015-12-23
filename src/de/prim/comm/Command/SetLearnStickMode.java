package de.prim.comm.Command;

import de.prim.comm.protocol.AviLightProtocol;

public class SetLearnStickMode extends MultiByteCommand
{
  public SetLearnStickMode(byte mode)
  {
    super( AviLightProtocol.CMD_SET_LEARN_STICKMODE, new byte[] { mode } );
  }

}
