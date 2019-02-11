package com.bartmont.pollutionapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
    public class Meta
    {
        @Id
        @GeneratedValue
        private Long id;

        private String license;

        private String website;

        private String found;

        private String name;

        private String limit;

        private String page;

        public String getLicense ()
        {
            return license;
        }

        public void setLicense (String license)
        {
            this.license = license;
        }

        public String getWebsite ()
        {
            return website;
        }

        public void setWebsite (String website)
        {
            this.website = website;
        }

        public String getFound ()
        {
            return found;
        }

        public void setFound (String found)
        {
            this.found = found;
        }

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        public String getLimit ()
        {
            return limit;
        }

        public void setLimit (String limit)
        {
            this.limit = limit;
        }

        public String getPage ()
        {
            return page;
        }

        public void setPage (String page)
        {
            this.page = page;
        }

    }
