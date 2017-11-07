package org.xBaseJ;

import org.xBaseJ.fields.Field;

import java.io.IOException;

public interface DbfApi {
    int getFieldCount();

    int getRecordCount();

    int getCurrentRecordNumber();

    void gotoRecord(int recno, boolean lock)
		throws xBaseJException, IOException;

    void gotoRecord(int recno) throws xBaseJException, IOException;

    void write(boolean lock) throws xBaseJException, IOException;

    void write() throws xBaseJException, IOException;

    void update(boolean lock) throws xBaseJException, IOException;

    void update() throws xBaseJException, IOException;

    void delete() throws IOException, xBaseJException;

    void undelete() throws IOException, xBaseJException;

    void close() throws IOException;

    Field getField(int i)
		throws ArrayIndexOutOfBoundsException, xBaseJException;

    Field getField(String name)
            throws xBaseJException, ArrayIndexOutOfBoundsException;

    boolean deleted();

    void pack()
		throws
			xBaseJException,
			IOException,
			SecurityException,
			CloneNotSupportedException;

    DBFTypes getVersion();

    void addField(Field aField) throws xBaseJException, IOException;
}
