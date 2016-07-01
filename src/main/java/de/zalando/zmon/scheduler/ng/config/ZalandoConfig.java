package de.zalando.zmon.scheduler.ng.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by jmussler on 4/1/15.
 */

@Component
@Profile("zalando")
@ConfigurationProperties(prefix = "zalando.entities")
public class ZalandoConfig {

    public static class BaseAdapterConfig {
        public String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int refresh;

        public int getRefresh() {
            return refresh;
        }

        public void setRefresh(int refresh) {
            this.refresh = refresh;
        }
    }

    public static class AuthAdapterConfig extends BaseAdapterConfig {
        public String user;
        public String password;
        public String token;

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }

    public static class Entityservice extends AuthAdapterConfig {
    }

    public static class Cmdb extends AuthAdapterConfig {
    }

    public static class DeployCtl extends AuthAdapterConfig {
    }

    public static class DdsCluster extends BaseAdapterConfig {
    }

    public static class DdsDatabase extends BaseAdapterConfig {
    }

    public Entityservice entityservice;
    public Cmdb cmdb;
    public DeployCtl deployctl;
    public DeployCtl projects;
    public DdsCluster ddscluster;
    public DdsDatabase ddsdatabase;

    public DeployCtl getProjects() {
        return projects;
    }

    public void setProjects(DeployCtl projects) {
        this.projects = projects;
    }

    public DeployCtl getDeployctl() {
        return deployctl;
    }

    public void setDeployctl(DeployCtl deployctl) {
        this.deployctl = deployctl;
    }

    public Cmdb getCmdb() {
        return cmdb;
    }

    public void setCmdb(Cmdb cmdb) {
        this.cmdb = cmdb;
    }

    public Entityservice getEntityservice() {
        return entityservice;
    }

    public void setEntityservice(Entityservice entityservice) {
        this.entityservice = entityservice;
    }

    public DdsCluster getDdscluster() {
        return ddscluster;
    }

    public void setDdscluster(DdsCluster ddscluster) {
        this.ddscluster = ddscluster;
    }

    public DdsDatabase getDdsdatabase() {
        return ddsdatabase;
    }

    public void setDdsdatabase(DdsDatabase ddsdatabase) {
        this.ddsdatabase = ddsdatabase;
    }
}
