**What it does?**
This is java demo app where we have configured cicd pipeline and it will automatically copy the jar to Azure VM and will start the java service.

How to spin Azure VM?
https://github.com/vsnemade/azure-hands-on/tree/main/vm-demo
It will output public IP which you need to update the public ip and ssh private key in below 

How to create SSH keys?
ssh-keygen -t rsa -b 4096 -C "github-actions"
# Save as: ~/.ssh/github-actions

How to copy github-actions.pub to Azure VM?
cmd on git bash: ssh-copy-id -i ~/.ssh/github-actions.pub azureuser@<VM_PUBLIC_IP>

What to update secrets in github and where?
- Go to Settings of https://github.com/vsnemade/springboot-cicd.
- Under Security section, you have 'Secrets and Variables'. You need need update 3 secrets
  HOST --> should be public ip
  SSH_PRIVATE_KEY  ---> private ssh key which you generated before rrunning terraform scripts. Youn need to copy the github-actions.pub to Azure VM and content of github-actions (private key) here.
  USERNAME -->azureuser

