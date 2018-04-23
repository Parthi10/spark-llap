package com.hortonworks.spark.sql.hive.llap;

import org.apache.spark.sql.Row;
import org.apache.spark.sql.sources.v2.reader.DataReaderFactory;
import org.apache.spark.sql.sources.v2.reader.DataReader;

public class MockHiveWarehouseDataReaderFactory implements DataReaderFactory<Row> {

    @Override
    public DataReader<Row> createDataReader() {
        return new MockHiveWarehouseDataReader();
    }

}
