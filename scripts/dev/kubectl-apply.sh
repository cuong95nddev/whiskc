export KUBECONFIG=~/kube/whiskc-dev-kubeconfig.yml
cd ../..

kubectl apply -f deployment/kubernetes/database/k8s.yml && \

kubectl apply -f deployment/kubernetes/auth/k8s.yml && \

kubectl apply -f deployment/kubernetes/keycloak/k8s.yml && \

kubectl apply -f deployment/kubernetes-overlays/dev/ingress/ingress.yml
