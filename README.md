# helloCloudRun
1. Got docker container running locally
2. Committed project to git
3. Set up trigger pointing at git repo, which will build a docker container when my repo gets updated
4. Set up a Service in CloudRun
    1. Point Service at Container in GCP container registry (for me it was nested down under GitHub, but there's got to be a better way)
    2. Had to set memory to 1gb
5. Once that's started, I could hit my server from the GCP cloudshell using 
            curl -H "Authorization: Bearer $(gcloud auth print-identity-token)" https://frank-cloudrun-j5a53pgyya-uc.a.run.app/hello

Hitting it from my local terminal:
1. Activate my python27 venv
2. gcloud auth login
3. gcloud auth activate-service-account --key-file {$KEY_FILE}
4. curl -H "Authorization: Bearer $(gcloud auth print-identity-token)" https://frank-cloudrun-j5a53pgyya-uc.a.run.app/hello
