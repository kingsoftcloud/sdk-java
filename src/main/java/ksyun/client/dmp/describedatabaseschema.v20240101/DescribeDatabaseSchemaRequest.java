package ksyun.client.dmp.describedatabaseschema.v20240101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeDatabaseSchemaRequest
* @Description 请求参数
*/
@Data
public class DescribeDatabaseSchemaRequest{
    /**数据库Id*/
    @KsYunField(name="DatabaseId")
    private Integer DatabaseId;

}
