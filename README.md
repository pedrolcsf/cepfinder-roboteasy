# **CEP Finder**

Este projeto consiste em uma aplicação web para consulta de CEP, utilizando um backend em **Spring Boot** e um frontend em **VueJS com Quasar**. A aplicação consome a API pública do [ViaCEP](https://viacep.com.br/) e implementa caching e conteinerização com **Docker**.

---

## **Sumário**
- [Descrição](#descrição)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Funcionalidades](#funcionalidades)
- [Requisitos](#requisitos)
- [Como Executar](#como-executar)
  - [Execução com Docker](#execução-com-docker)
  - [Execução Manual](#execução-manual)

---

## **Descrição**

O **CEP Finder** foi desenvolvido para o teste técnico roboteasy

---

## **Tecnologias Utilizadas**

### Backend
- Java 17
- Spring Boot
- Spring Cache
- REST API
- Maven

### Frontend
- VueJS
- Quasar
- Axios

### Outros
- Docker & Docker Compose
- NGINX
- ViaCEP API

---

## **Funcionalidades**
- Consulta de CEPs.
- Exibição de informações detalhadas do endereço:
  - Rua
  - Bairro
  - Cidade
  - Estado
- Caching para evitar múltiplas consultas à mesma informação.
- Tratamento de erros para CEPs inválidos ou não encontrados.

---

## **Requisitos**

- **Docker** (opcional, para execução conteinerizada)
- **Java 17+** e **Maven** (para execução manual do backend)
- **Node.js 16+** e **npm** (para execução manual do frontend)

---

## **Como Executar**

### **Execução com Docker**
1. Certifique-se de que o **Docker** e o **Docker Compose** estão instalados em sua máquina.
2. Clone o repositório:
   ```bash
   git clone https://github.com/pedrolcsf/cepfinder-roboteasy.git
   cd cepfinder-roboteasy
   ```
3. Execute o Docker Compose:
   ```bash
   docker-compose up --build
   ```
4. Acesse o aplicativo em: [http://localhost](http://localhost) (porta 80)

---

### **Execução Manual**

#### **Backend**
1. Certifique-se de ter o **Java 17** e o **Maven** instalados.
2. Navegue para a pasta do backend:
   ```bash
   cd backend
   ```
3. Compile e inicie o servidor:
   ```bash
   mvn clean install
   java -jar target/cep-app.jar
   ```
4. O backend estará disponível em: [http://localhost:8080](http://localhost:8080)

#### **Frontend**
1. Certifique-se de ter o **Node.js** e o **npm** instalados.
2. Navegue para a pasta do frontend:
   ```bash
   cd frontend
   ```
3. Instale as dependências:
   ```bash
   npm install
   ```
4. Inicie o servidor de desenvolvimento:
   ```bash
   npm run dev
   ```
5. O frontend estará disponível em: [http://localhost:9000](http://localhost:9000)

---