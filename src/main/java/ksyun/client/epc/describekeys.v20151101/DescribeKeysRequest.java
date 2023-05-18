package ksyun.client.epc.describekeys.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeKeysRequest
* @Description 请求参数
*/
@Data
public class DescribeKeysRequest{
    /**
- 用户密钥对的资源ID，可查询多个ID的实例信息，查看详细[ID.N](https://docs.ksyun.com/documents/5755)使用方式	
- 类型：String
- 是否必填：否
- 缺省值：查询region下所有的密钥信息


#### */
    @KsYunField(name="KeyId")
    private List<String> KeyIdList;


}