<template>
  <q-card class="q-mb-md">
    <q-card-section>
      <div class="text-h6">{{ address.logradouro }}</div>
      <div>{{ address.bairro }}, {{ address.localidade }} - {{ address.uf }}</div>
      <div><strong>CEP:</strong> {{ address.cep }}</div>
    </q-card-section>
  </q-card>
</template>

<script>
export default {
  props: {
    address: Object,
  },
};
</script>
