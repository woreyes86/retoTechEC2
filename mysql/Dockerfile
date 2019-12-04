# Derived from official mysql image (our base image)
FROM mysql/mysql-server:5.7
# Add a database
#ENV MYSQL_DATABASE eshupingahua
ENV MYSQL_ROOT_PASSWORD root
# Add the content of the sql-scripts/ directory to your image
# All scripts in docker-entrypoint-initdb.d/ are automatically
# executed during container startup
COPY schema.sql /docker-entrypoint-initdb.d/