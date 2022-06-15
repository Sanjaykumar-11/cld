import dropbox
dropbox_access_token= "sl.BJjOpNU5K9BAq9dQo1JT-1OWD-M7PxBpNwFiXY5JdvXv8pwUMs66Ba9wdOtz5BaZLmqzv9RYC_iqBhioppzJxkdCAVuNDWz45HIwB3eJrbGwR7yglXAaBAEbC1t9fFdixUANURT8kf4"    #Enter your own access token
# dropbox_path= "/velu/sample.txt"
# computer_path="E:\Model\Dropbox\sample.txt"
client = dropbox.Dropbox(dropbox_access_token)
# print("[SUCCESS] dropbox account linked")
# client.files_upload(open(computer_path, "rb").read(), dropbox_path)
# print("[UPLOADED] {}".format(computer_path))

with open("sample.txt", "wb") as f:
    metadata, res = client.files_download(path="/velu/sample.txt")
    f.write(res.content)