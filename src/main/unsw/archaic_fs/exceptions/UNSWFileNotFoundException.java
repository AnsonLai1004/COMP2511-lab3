package unsw.archaic_fs.exceptions;

import java.io.IOException;

public class UNSWFileNotFoundException extends IOException {

    public UNSWFileNotFoundException(String string) {
        super(string);
    }

}
