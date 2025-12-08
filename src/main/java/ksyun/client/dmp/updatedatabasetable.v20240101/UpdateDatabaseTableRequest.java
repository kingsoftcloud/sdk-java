package ksyun.client.dmp.updatedatabasetable.v20240101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateDatabaseTableRequest
* @Description 请求参数
*/
@Data
public class UpdateDatabaseTableRequest{
    /***/
    @KsYunField(name="DatabaseId")
    private String DatabaseId;

}
