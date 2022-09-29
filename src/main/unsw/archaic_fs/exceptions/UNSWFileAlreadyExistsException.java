package unsw.archaic_fs.exceptions;

import java.io.IOException;

public class UNSWFileAlreadyExistsException extends IOException {

    public UNSWFileAlreadyExistsException(String string) {
        super(string);
    }

}
