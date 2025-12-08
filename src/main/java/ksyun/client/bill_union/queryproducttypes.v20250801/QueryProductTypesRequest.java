package ksyun.client.bill_union.queryproducttypes.v20250801;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname QueryProductTypesRequest
* @Description 请求参数
*/
@Data
public class QueryProductTypesRequest{
    /**产品线code*/
    @KsYunField(name="ProductGroupCode")
    private String ProductGroupCode;

}
