## Certificate Files

This folder is a placeholder for the container. When the container starts, the `boot` script will attempt to copy all files from `S3_CERTS_PATH` into this folder.

The Nginx template is designed to discover certificates under locations matching its configured `SERVER_NAME` property. Therefore, if a gateway is available at `users-api.stockflare.com`, the container will attempt to read certificates from: `<my-s3-bucket-path>/users-api.stockflare.com/chain.crt`.

In addition, client certificates are assumed to be located under the same path.

In order for this SSL Gateway to work under HTTPS, the following files are expected to be present:

```
<s3-bucket-path>/<server-name>/chain.crt
<s3-bucket-path>/<server-name>/client.crt
<s3-bucket-path>/<server-name>/key.pem
```
