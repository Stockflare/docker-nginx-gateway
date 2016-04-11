#!/usr/bin/env bash
SEP="======================================================"

echo $SEP
echo "Retrieving S3 Certificate files..."
echo $SEP
aws s3 sync $S3_CERTS_PATH /certs
ls -Rl /certs/
echo $SEP

confd -onetime -backend env

echo "Wrote nginx config..."
echo $SEP
cat /etc/nginx/nginx.conf
echo $SEP

nginx
