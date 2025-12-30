package ksyun.client.postgresql.describedbinstanceextensions.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDBInstanceExtensionsResponse
* @Description DescribeDBInstanceExtensions 返回体
*/
@Data
@ToString
public class DescribeDBInstanceExtensionsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**已安装插件列表 */
        @JsonProperty("Installed")
        private List<DataInstalledDto> Installed;

        @Data
        @ToString
        public static class DataInstalledDto {
            /**插件描述*/
            @JsonProperty("Comment")
            private String Comment;

            /**默认版本*/
            @JsonProperty("DefaultVersion")
            private String DefaultVersion;

            /**下载版本*/
            @JsonProperty("InstalledVersion")
            private String InstalledVersion;

            /**插件名称*/
            @JsonProperty("Name")
            private String Name;

        }

        /**未安装插件列表*/
        @JsonProperty("Uninstalled")
        private List<DataUninstalledDto> Uninstalled;

        @Data
        @ToString
        public static class DataUninstalledDto {
            /**插件描述*/
            @JsonProperty("Comment")
            private String Comment;

            /**默认版本*/
            @JsonProperty("DefaultVersion")
            private String DefaultVersion;

            /**插件名称*/
            @JsonProperty("Name")
            private String Name;

        }

    }

}
