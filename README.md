## Usage

The container requires the presence of three environment variables. These variables will be used to configure Nginx when the container starts.

**Note:** The resulting configuration is checked for validity.

| Env           | Purpose                                                      |
|:--------------|:-------------------------------------------------------------|
| `LISTEN_ON`   | Determines which port Nginx will listen on (defaults to 443) |
| `SERVER_NAME` | URI of the server                                            |
| `LOCATION`    | The URL to forward the client onto,                          |

## Brief Example

```
docker run -p 443:443 \
           -e LISTEN_ON=80 \
           -e SERVER_NAME=my.public.api.my-company.com \
           -e LOCATION=http://secure.my-company.com \
           -d stockflare/nginx-gateway
```

This container would then start listening to traffic on port `80`, forwarding authenticated clients onto the private URL.
