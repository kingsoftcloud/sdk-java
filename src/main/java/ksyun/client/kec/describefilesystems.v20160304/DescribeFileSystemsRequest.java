package ksyun.client.kec.describefilesystems.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeFileSystemsRequest
* @Description 请求参数
*/
@Data
public class DescribeFileSystemsRequest{
    /**预查看的文件系统ID*/
    @KsYunField(name = "FileSystemId", type = 1)
    private List<String> FileSystemIdList;

    /**单次调用所返回的最大实例数目，取值为5~1000，超过1000记为1000*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**项目制id，默认为0*/
    @KsYunField(name = "ProjectId", type = 1)
    private List<Integer> ProjectIdList;

    /**是否包含删除的，默认为false*/
    @KsYunField(name="IncludeDel")
    private Boolean IncludeDel;

    /**可查询file-system-name和ip-address*/
    @KsYunField(name = "Filter", type = 1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /***/
        @KsYunField(name="Name.N")
        private String NameN;

        /***/
        @KsYunField(name="Value.N")
        private String ValueN;

    }

}
